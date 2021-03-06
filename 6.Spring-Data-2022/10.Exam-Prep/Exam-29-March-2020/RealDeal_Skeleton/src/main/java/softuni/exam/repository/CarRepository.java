package softuni.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import softuni.exam.models.Car;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    @Query("SELECT c FROM Car c" +
            " WHERE c.make = :make AND" +
            " c.model = :model AND" +
            " c.kilometers = :kilometers")
    Optional<Car> findByMakeModelAndKilometers(String make, String model, Integer kilometers);

    @Query("SELECT c FROM Car c" +
            " ORDER BY c.pictures.size DESC, c.make ASC")
    List<Car> findByPictureCountDescThenByMake();

}
