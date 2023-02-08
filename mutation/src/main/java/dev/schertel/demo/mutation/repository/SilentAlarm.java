package dev.schertel.demo.mutation.repository;

import dev.schertel.demo.mutation.domain.AlarmRepository;
import org.springframework.stereotype.Repository;

@Repository
class SilentAlarm implements AlarmRepository {

    @Override
    public void soundTheAlarm() {
        throw new UnsupportedOperationException("soundTheAlarm");
    }
}
