import javax.persistence.EntityManager;
import javax.servlet.*;
import java.io.IOException;

public class EntityManagerFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        EntityManager em = null;
        servletRequest.setAttribute("em",em);
        filterChain.doFilter(servletRequest, servletResponse);
        em.close();
    }

    @Override
    public void destroy() {

    }
}
