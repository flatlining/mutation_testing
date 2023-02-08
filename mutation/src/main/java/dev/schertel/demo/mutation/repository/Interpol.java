package dev.schertel.demo.mutation.repository;

import dev.schertel.demo.mutation.domain.SecurityServiceRepository;
import org.springframework.stereotype.Repository;

@Repository
class Interpol implements SecurityServiceRepository {
    @Override
    public Boolean hasNoOutstandingPrisonWarrant(final String lastName, final String firstName) {
        throw new UnsupportedOperationException("hasOutstandingPrisonWarrant");
    }
}
