from BaseHTTPServer import BaseHTTPRequestHandler, HTTPServer


class MyHandler(BaseHTTPRequestHandler):
    def do_GET(self):
        self.send_response(200)
        self.send_header('Content-type', 'text/html')
        self.end_headers()
        self.wfile.write("50.163570 19.887585 BattleFragment")


PORT = 8000

server = HTTPServer(("192.168.1.106", PORT), MyHandler)
server.serve_forever()
