package hello.constants;

public class SecurityConstants {
	//this can be shared in microservices either via redis or some other common store
	public static final String SECRET = "SecretKeyToGenJWTs1";
	//this is just a prefix -ease of use so moved in constants -othewise every service need to parse it
    public static final String TOKEN_PREFIX = "Bearer ";
    //this is header name
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/users/sign-up";

}
