package dev.schertel.demo.mutation.domain;

public interface SecurityServiceRepository {

    Boolean hasNoOutstandingPrisonWarrant(String lastName, String firstName);
}
