package com.example.APIViagem.service;

import com.example.APIViagem.api.model.Destination;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DestinationService {
    private List<Destination> destinations = new ArrayList<>();
    private Long nextId = 1L;

    public Destination addDestination(Destination destination) {
        destination.setId(nextId++);
        destinations.add(destination);
        return destination;
    }


    public List<Destination> getAllDestinations() {
        return destinations;
    }

    public Optional<Destination> getDestinationById(Long id) {
        return destinations.stream()
                .filter(d -> d.getId().equals(id))
                .findFirst();
    }

    public List<Destination> searchDestinations(String query) {
        return destinations.stream()
                .filter(d -> d.getName().toLowerCase().contains(query.toLowerCase())
                        || d.getLocation().toLowerCase().contains(query.toLowerCase()))
                .toList();
    }

    public Optional<Destination> rateDestination(Long id, int rating) {
        Optional<Destination> destination = getDestinationById(id);
        destination.ifPresent(d -> {
            d.setRating((d.getRating() * d.getRatingCount() + rating) / (d.getRatingCount() + 1));
            d.setRatingCount(d.getRatingCount() + 1);
        });
        return destination;
    }

    public boolean deleteDestination(Long id) {
        return destinations.removeIf(d -> d.getId().equals(id));
    }
}
