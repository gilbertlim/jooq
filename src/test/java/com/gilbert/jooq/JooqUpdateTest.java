package com.gilbert.jooq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import com.gilbert.jooq.actor.dto.ActorUpdateRequest;
import com.gilbert.jooq.actor.repository.ActorRepository;
import org.jooq.generated.tables.pojos.Actor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@Transactional
@SpringBootTest
public class JooqUpdateTest {

    @Autowired
    private ActorRepository actorRepository;

    @Test
    void update_with_pojo() {
        Actor actor = actorRepository.saveWithReturning(getActor());

        actor.setLastName("Tom");
        actorRepository.update(actor);
        // pojo를 사용할 경우 모든 column을 업데이트

        Actor updatedActor = actorRepository.findById(actor.getActorId());
        assertThat(updatedActor.getLastName()).isEqualTo("Tom");
    }

    private Actor getActor() {
        Actor actor = new Actor();
        actor.setFirstName("John");
        actor.setLastName("Doe");
        return actor;
    }

    @Test
    void update_specific_field() {
        Long actorId = actorRepository.saveWithReturningPkOnly(getActor());
        ActorUpdateRequest request = new ActorUpdateRequest("Tom");
        actorRepository.updateWithDto(actorId, request);

        Actor updatedActor = actorRepository.findById(actorId);
        assertThat(updatedActor.getFirstName()).isEqualTo("Tom");
        assertThat(updatedActor.getLastName()).isEqualTo("Doe");
    }

    @Test
    void update_specific_field_with_record() {
        Long actorId = actorRepository.saveWithReturningPkOnly(getActor());
        ActorUpdateRequest request = new ActorUpdateRequest("Tom");
        actorRepository.updateWithRecord(actorId, request);

        Actor updatedActor = actorRepository.findById(actorId);
        assertThat(updatedActor.getFirstName()).isEqualTo("Tom");
        assertThat(updatedActor.getLastName()).isEqualTo("Doe");
    }

    @Test
    void delete() {
        Long actorId = actorRepository.saveWithReturningPkOnly(getActor());
        actorRepository.delete(actorId);
    }

    @Test
    void delete_with_record() {
        Long actorId = actorRepository.saveWithReturningPkOnly(getActor());
        actorRepository.deleteWithRecord(actorId);
    }

    @Test
    void delete_with_no_where() {
        assertThatThrownBy(() -> actorRepository.deleteWithNowhere());
    }
}
