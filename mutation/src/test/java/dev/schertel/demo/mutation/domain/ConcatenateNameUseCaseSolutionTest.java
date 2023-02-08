package dev.schertel.demo.mutation.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

@Disabled("solution")
@ExtendWith({ MockitoExtension.class })
class ConcatenateNameUseCaseSolutionTest {

    @Mock
    SecurityServiceRepository securityService;

    @Mock
    AlarmRepository alarm;

    @InjectMocks
    ConcatenateNameUseCase cut;

    @ParameterizedTest
    @MethodSource
    void apply(final String firstName, final String lastName) {
        final var actual = cut.apply(firstName, lastName);

        assertThat(actual)
                .hasSize(42)
                .contains(firstName, lastName);

        verify(alarm).soundTheAlarm();
    }

    private static Stream<Arguments> apply() {
        return Stream.of(
                Arguments.of("Sasha", "Doe"),
                Arguments.of("firstnamewith20chara", "lastnamewith20charac")
        );
    }
}
