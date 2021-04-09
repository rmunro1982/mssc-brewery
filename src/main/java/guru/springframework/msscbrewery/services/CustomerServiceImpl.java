package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder()
                .name("Test customer")
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public CustomerDto createNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .name(customerDto.getName())
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(CustomerDto customerDto) {

    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.debug("Deleting customer with ID {}", customerId);
    }
}
