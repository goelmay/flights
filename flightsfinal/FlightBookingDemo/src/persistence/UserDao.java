package persistence;

import entity.UserDetails;

public interface UserDao {
    public void insertRecord(UserDetails user);
}
