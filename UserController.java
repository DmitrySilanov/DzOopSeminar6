public interface UserController<T extends User> {
    void create(String firsName, String lastName, String middleName);
}

