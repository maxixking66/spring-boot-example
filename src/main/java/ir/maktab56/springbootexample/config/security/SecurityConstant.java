package ir.maktab56.springbootexample.config.security;

public class SecurityConstant {

    private SecurityConstant() {

    }


    public static String[] getPermitAllUrls() {
        return new String[]{
                "/login", "/assets", "/assets/**", "/home"
        };
    }

    public static String[] getAdminPaths() {
        return new String[]{
                "/admin", "/admin/**", "/teacher/**"
        };
    }

    public static String[] getTeacherPaths() {
        return new String[]{
                "/teacher", "/teacher/*"
        };
    }

    public static String[] getStudentPath() {
        return new String[]{
                "/stuede", "/stuede/*"
        };
    }
}
