package dev.jchristian.EncurtadorUrl.domain.Service;

import dev.jchristian.EncurtadorUrl.domain.entity.ShortUrlEntity;
import dev.jchristian.EncurtadorUrl.domain.entity.UserEntity;
import dev.jchristian.EncurtadorUrl.domain.models.ShortUrlDto;
import dev.jchristian.EncurtadorUrl.domain.models.UserDto;
import org.springframework.stereotype.Component;

@Component
public class EntityMapper {

    public ShortUrlDto toShortUrlDto(ShortUrlEntity shortUrl) {
        UserDto userDto = null;
        if(shortUrl.getCreatedBy() != null) {
            userDto = toUserDto(shortUrl.getCreatedBy());
        }

        return new ShortUrlDto(
                shortUrl.getId(),
                shortUrl.getShortKey(),
                shortUrl.getOriginalUrl(),
                shortUrl.getIsPrivate(),
                shortUrl.getExpiresAt(),
                userDto,
                shortUrl.getClickCount(),
                shortUrl.getCreatedAt()
        );
    }

    public UserDto toUserDto(UserEntity user) {
        return new UserDto(user.getId(), user.getName());
    }
}