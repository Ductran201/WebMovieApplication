package ra.webmovieapplication.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ra.webmovieapplication.model.entity.Film;

public interface IFilmRepo extends JpaRepository<Film,Integer> {
    Page<Film> findAllByNameContains(String name, Pageable pageable);

    @Query("select f.image from Film f where f.id= :id ")
    String getImgById(@Param("id") Integer id);
}
