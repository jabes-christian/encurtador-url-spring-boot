package dev.jchristian.EncurtadorUrl.domain.Repository;

import dev.jchristian.EncurtadorUrl.domain.entity.ShortUrlEntity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ShortUrlRepository extends JpaRepository<ShortUrlEntity, Long> {
    @Query("select su from ShortUrlEntity su left join su.createdBy where su.isPrivate = false")
    Page<ShortUrlEntity> findPublicShortUrls(Pageable pageable);

    boolean existsByShortKey(String shortKey);

    Optional<ShortUrlEntity> findByShortKey(String shortKey);

    Page<ShortUrlEntity> findByCreatedById(Long userId, Pageable pageable);

    @Modifying
    void deleteByIdInAndCreatedById(List<Long> ids, Long userId);

    @Query("select u from ShortUrlEntity u left join fetch u.createdBy")
    Page<ShortUrlEntity> findAllShortUrls(Pageable pageable);
}

