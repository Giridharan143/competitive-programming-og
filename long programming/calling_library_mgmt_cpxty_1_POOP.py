from library_mgmt_cpxty_1_POOP import Book

Book_caller=Book("The Firm", "John Grisham")
Book_caller_1=Book("It Ends With Us", "Collen Hoover")
Book_caller.display_info()
#Book_caller.borrow()
Book_caller_1.borrow()
Book_caller_1.return_()
#Book_caller.display_info()
Book_caller_1.display_info()
Book_caller.return_() # It won't run as the Book isn't borrowed from the library
#Book_caller=Book("It Ends With Us", "Collen Hoover")