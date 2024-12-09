class Movie:
    def __init__(self,title,genre):
        self.title=title
        self.genre=genre
        self.is_available=True
    
    def display_info(self):
        status = "Available" if self.is_available else "Rented"
        print(f"The Movie : {self.title} of Genre: {self,genre} is {status}!!")
    
    def rent_movie(self):
        if self.is_available:
            self.is_available = False
            print(f"Successfully Rented the Movie: {self.title}")
