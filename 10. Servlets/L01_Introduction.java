public class L01_Introduction {
    public static void main(String[] args) {
        
    }
}
// Servlets are server-side Java programs that are used to handle the request and response between the client and server.
// Servlets are used to create web applications. They are used to create dynamic web pages.

// MVC : Model View Controller
// Model: Database
// View: User Interface
// Controller: Servlet

// Heirarchy of Servlet:
// Servlet interface -> Generic Servlet class -> HTTP Servlet class
// In generic servlet, we don't have request and response objects. It is independent of protocol.
// In HTTP servlet, we have request and response objects. it is protocol based.

// Servlet life cycle:
// 1. Loading and instantiation of the servlet: Servlet class loaded and object created.
// 2. Initialization of the servlet: Servlet object is initialized(init() method is called).
// 3. Request handling: Handle/serve the client request(service() method is called).
// 4. Destroying the servlet: Servlet object is destroyed(destroy() method is called).

// Servlet life cycle methods:
// 1. init(): This method is called only once in the life cycle of the servlet. It is used to initialize the servlet.
// 2. service(): This method is called every time when the client request is made. It is used to handle the client request.
// 3. destroy(): This method is called only once in the life cycle of the servlet. It is used to destroy the servlet.