package ru.practicum.main_service.event.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import ru.practicum.main_service.MainCommonUtils;
import ru.practicum.main_service.category.model.Category;
import ru.practicum.main_service.event.enums.EventState;
import ru.practicum.main_service.user.model.User;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "events", schema = "public")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false, length = MainCommonUtils.MAX_LENGTH_TITLE)
    String title;

    @Column(nullable = false, length = MainCommonUtils.MAX_LENGTH_ANNOTATION)
    String annotation;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    Category category;

    @Column(nullable = false, length = MainCommonUtils.MAX_LENGTH_DESCRIPTION)
    String description;

    @Column(nullable = false)
    Boolean paid;

    @Column(nullable = false)
    Integer participantLimit;

    @Column(nullable = false)
    LocalDateTime eventDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    Location location;

    @Column(nullable = false)
    LocalDateTime createdOn;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    EventState state;

    LocalDateTime publishedOn;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    User initiator;

    @Column(nullable = false)
    Boolean requestModeration;

}