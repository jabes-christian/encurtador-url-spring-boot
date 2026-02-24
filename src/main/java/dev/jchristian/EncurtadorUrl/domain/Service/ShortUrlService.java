package dev.jchristian.EncurtadorUrl.domain.Service;

import dev.jchristian.EncurtadorUrl.domain.Repository.ShortUrlRepository;
import dev.jchristian.EncurtadorUrl.domain.entity.ShortUrlEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShortUrlService {
    private final ShortUrlRepository shortUrlRepository;

    public ShortUrlService(ShortUrlRepository shortUrlRepository) {
        this.shortUrlRepository = shortUrlRepository;
    }

    public List<ShortUrlEntity> findAllPublicShortUrls() {
        return shortUrlRepository.findPublicShortUrls();
    }
}