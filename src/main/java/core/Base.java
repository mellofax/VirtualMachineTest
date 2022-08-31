package core;

import core.classes.User;

public class Base {
    public static final User standard_user = new User("standard_user", "secret_sauce");
    public static final User locked_out_user = new User("locked_out_user", "secret_sauce");
    public static final User problem_user = new User("problem_user", "secret_sauce");
}
