class Book:
    def __init__(self,title,author):
        self.title=title
        self.author=author
        self.availability=True

    def display_info(self):
        status= "Available" if self.availability else "Borrowed"
        print(f"The Book : {self.title} of author: {self.author} -> Status: {status}")
    
    def borrow(self):
        if self.availability:
            self.availability=False
            print(f"You have successfully borrowed the Book: {self.title}")
        else:
            print(f"Oops !! The Book : {self.title} is Borrowed !!")
    def return_(self):
        if not self.availability:
            self.availability=True
            print(f"The Book: {self.title} has been Returned Safely")
'''
Book_caller=Book("The Firm", "John Grisham")
Book_caller.display_info()
Book_caller.borrow()
Book_caller.borrow()
Book_caller.display_info()
Book_caller.return_()
'''