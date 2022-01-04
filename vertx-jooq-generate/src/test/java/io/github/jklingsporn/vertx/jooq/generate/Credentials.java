package io.github.jklingsporn.vertx.jooq.generate;

/**
 * Created by jensklingsporn on 19.03.18.
 */
public enum Credentials {

    HSQLDB("sa", ""),
    POSTGRES("vertx", "password"),
    MYSQL("root", "vertx");

    private final String user;
    private final String password;

    Credentials(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUser() {
        return user;
    }
}
