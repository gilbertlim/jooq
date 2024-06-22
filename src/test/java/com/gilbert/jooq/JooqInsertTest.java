package com.gilbert.jooq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import com.gilbert.jooq.actor.repository.ActorRepository;
import org.jooq.generated.tables.pojos.Actor;
import org.jooq.generated.tables.records.ActorRecord;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Transactional
@SpringBootTest
public class JooqInsertTest {

    @Autowired
    private ActorRepository actorRepository;

    @Test
    void insert_dao() {
        Actor actor = getActor();
        actorRepository.saveByDao(actor);
        assertThat(actor.getActorId()).isNotNull();
        assertThat(actor.getLastUpdate()).isNull();
        // generated Dao를 사용할 경우 엔티티에 generated PK가 자동 세팅됨
        // column default 값은 매핑 불가
    }

    private Actor getActor() {
        Actor actor = new Actor();
        actor.setFirstName("John");
        actor.setLastName("Doe");
        //actor.setLastUpdate(LocalDateTime.now());
        return actor;
    }

    @Test
    void insert_by_record() {
        Actor actor = getActor();
        ActorRecord actorRecord = actorRepository.saveByRecord(actor);
        assertThat(actor.getActorId()).isNull();
        assertThat(actor.getLastUpdate()).isNull();
        assertThat(actorRecord.getActorId()).isNotNull();
        assertThat(actorRecord.getLastUpdate()).isNull();
    }

    @Test
    void insert_with_returning_pk() {
        Actor actor = getActor();
        Long pk = actorRepository.saveWithReturningPkOnly(actor);
        assertThat(pk).isNotNull();
    }

    @Test
    void insert_with_returning() {
        Actor actor = getActor();
        Actor geneatedActor = actorRepository.saveWithReturning(actor);
        assertThat(geneatedActor).hasNoNullFieldsOrProperties();
        // insert 후 select하여 필드를 매핑함(query 2번 발생)
    }

    @Test
    void bulk_insert() {
        Actor actor1 = new Actor();
        actor1.setFirstName("John");
        actor1.setLastName("Doe");

        Actor actor2 = new Actor();
        actor2.setFirstName("John2");
        actor2.setLastName("Doe2");

        actorRepository.bulkInsertWithRows(List.of(actor1,actor2));
    }

    @Test
    void insert_select() {
        Actor actor = actorRepository.insertSelect(1L);
        assertThat(actor.getFirstName()).isEqualTo("PENELOPE");
    }
}
