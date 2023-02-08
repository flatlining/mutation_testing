package dev.schertel.demo.mutation.boundary;

import dev.schertel.demo.mutation.domain.ConcatenateNameUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/rest")
class RestResource {

    private final ConcatenateNameUseCase concatenateName;

    RestResource(final ConcatenateNameUseCase concatenateName) {
        this.concatenateName = concatenateName;
    }

    @GetMapping("/concatenate")
    String concatenate(@RequestParam final String firstName, @RequestParam final String lastName) {
        return concatenateName.apply(firstName, lastName);
    }
}
