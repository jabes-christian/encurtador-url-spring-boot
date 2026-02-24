package dev.jchristian.EncurtadorUrl.domain.Repository;

import dev.jchristian.EncurtadorUrl.domain.entity.ShortUrlEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ShortUrlRepository extends JpaRepository<ShortUrlEntity, Long> {
    @Query("select su from ShortUrlEntity su where su.isPrivate = false order by su.createdAt desc")
    List<ShortUrlEntity> findPublicShortUrls();
}

