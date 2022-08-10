import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
// ...
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
@OverridtpSecurity http) throws Exception {
http.headers()
.contentSecurityPolicy("script-src 'self' https://javascripts.example.com; report-uri /csp-report-endpoint/");
}
}
