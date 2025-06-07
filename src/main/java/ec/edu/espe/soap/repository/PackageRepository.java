package ec.edu.espe.soap.repository;

import ec.edu.espe.soap.model.Package;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageRepository extends JpaRepository<Package, String> {

    // Aqui podemos agregar métodos personalizados si son necesarios
    Optional<Package> findByTrackingNumber(String trackingNumber);
}
