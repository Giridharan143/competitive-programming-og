import http.server as s1
import socketserver as s2

port=8000

handler=s1.SimpleHTTPRequestHandler

with s2.TCPServer(("",port),handler) as http:
    print(f"Serving the web server @ 0.0.0.0 (https://localhost:{port}/)... ")
    try:
        http.serve_forever()
    except KeyboardInterrupt:
        print("\nShutting down the server.....")
        http.shutdown()