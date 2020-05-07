package kg.tommy.securityexam.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin").password("1234").roles("ADMIN");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests()
                .antMatchers(HttpMethod.GET,"/api/students/id").hasAnyRole()
                .antMatchers(HttpMethod.GET,"/api/students/name").hasAnyRole()
                .antMatchers(HttpMethod.DELETE,"/api/students").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST,"/api/students").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST,"/api/table").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT,"/api/students").hasRole("ADMIN")
                .and().csrf().disable();
    }
}
