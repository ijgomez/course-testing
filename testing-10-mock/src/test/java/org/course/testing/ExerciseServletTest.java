package org.course.testing;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.course.testing.ExerciseServlet;
import org.junit.Before;
import org.junit.Test;
import static org.easymock.EasyMock.*;

public class ExerciseServletTest {

    private ExerciseServlet exerciseServlet;

    @Before
    public void setUp() {
        exerciseServlet = new ExerciseServlet();
    }

    @Test
    public void testExerciseServlet() throws ServletException, IOException {
        HttpServletRequest mockRequest = createStrictMock(HttpServletRequest.class);
        RequestDispatcher mockRequestDispatcher = createStrictMock(RequestDispatcher.class);

        expect(mockRequest.getParameter("primerNombre")).andReturn("unNombre");
        expect(mockRequest.getParameter("segundoNombre")).andReturn("unApellido");

        mockRequest.setAttribute("primerNombre", "unNombre");
        mockRequest.setAttribute("segundoNombre", "unApellido");

        expect(mockRequest.getRequestDispatcher("/ver.jsp")).andReturn(mockRequestDispatcher);


        replay(mockRequest);

        exerciseServlet.doPost(mockRequest, null);

        verify(mockRequest);

        reset(mockRequest, mockRequestDispatcher);
    }
}
