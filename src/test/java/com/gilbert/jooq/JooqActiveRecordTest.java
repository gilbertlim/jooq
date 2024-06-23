package com.gilbert.jooq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import com.gilbert.jooq.actor.repository.ActorRepository;
import org.jooq.DSLContext;
import org.jooq.generated.tables.Actor_;
import org.jooq.generated.tables.records.ActorRecord;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Transactional
@SpringBootTest
public class JooqActiveRecordTest {

    @Autowired
    ActorRepository actorRepository;

    @Autowired
    DSLContext dslContext;

    @Test
    void select() {
        long actorId = 1L;
        ActorRecord actorRecord = actorRepository.findRecordByActorId(actorId);
        assertThat(actorRecord).hasNoNullFieldsOrProperties();
    }

    @Test
    void refresh() {
        long actorId = 1L;
        ActorRecord actorRecord = actorRepository.findRecordByActorId(actorId);
        actorRecord.setFirstName(null);
        actorRecord.refresh();
        assertThat(actorRecord.getFirstName()).isNotNull();
    }

    @Test
    void insert() {
        ActorRecord actorRecord = dslContext.newRecord(Actor_.ACTOR);
        actorRecord.setFirstName("John");
        actorRecord.setLastName("Doe");
        actorRecord.store(); // changed, fetched 데이터를 사용하여 upsert
        //actorRecord.insert(); // insert
        actorRecord.refresh(); // default 필드 정보를 가져오기 위해 호출
        assertThat(actorRecord.getLastUpdate()).isNotNull();
    }

    @Test
    void update() {
        long actorId = 1L;
        ActorRecord actorRecord = actorRepository.findRecordByActorId(actorId);
        String newName = "Tom";
        actorRecord.setFirstName(newName);
        actorRecord.store();
        //actorRecord.update();
        assertThat(actorRecord.getFirstName()).isEqualTo(newName);
    }

    @Test
    void delete() {
        ActorRecord actorRecord = dslContext.newRecord(Actor_.ACTOR);
        actorRecord.setFirstName("John");
        actorRecord.setLastName("Doe");
        actorRecord.store();

        int result = actorRecord.delete();
        assertThat(result).isEqualTo(1);
    }
}
