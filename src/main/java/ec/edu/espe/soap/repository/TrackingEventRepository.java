package ec.edu.espe.soap.repository;

import ec.edu.espe.soap.model.TrackingEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackingEventRepository extends JpaRepository<TrackingEvent, Long> {

}
