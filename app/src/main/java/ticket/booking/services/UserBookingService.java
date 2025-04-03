package ticket.booking.services;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import ticket.booking.entities.User;

public class UserBookingService {
    
    private User user;

    private List<User> userList;

    private static final String USERS_PATH = "app/src/main/java/ticket/booking/localDB/users.json";

    private ObjectMapper objectMapper = new ObjectMapper();  

    public UserBookingService(User user) throws IOException{
        this.user = user;
        File users = new File(USERS_PATH);
        userList = objectMapper.readValue(users, new TypeReference<List<User>>() {});
    }
}
