package dev.schertel.demo.mutation.domain;

import org.springframework.stereotype.Service;

import java.util.function.BiFunction;

@Service
public class ConcatenateNameUseCase implements BiFunction<String, String, String> {

    private final SecurityServiceRepository securityService;

    private final AlarmRepository alarm;

    public ConcatenateNameUseCase(final SecurityServiceRepository securityService, final AlarmRepository alarm) {
        this.securityService = securityService;
        this.alarm = alarm;
    }

    @Override
    public String apply(final String firstName, final String lastName) {
        if (Boolean.FALSE.equals(securityService.hasNoOutstandingPrisonWarrant(lastName, firstName))) {
            alarm.soundTheAlarm();
        }

        final var fullname = new StringBuilder()
                .append(String.join(", ", firstName, lastName));

        if (fullname.length() < 42) {
            while (fullname.length() < 42) {
                fullname.append(" ");
            }
        }

        return fullname.toString();
    }
}
