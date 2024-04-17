import tkinter as tk
from authentication import login

root = tk.Tk()
root.title("Inventory Management System")

login_button = tk.Button(root, text="Login", command=login)
login_button.pack()

root.mainloop()
