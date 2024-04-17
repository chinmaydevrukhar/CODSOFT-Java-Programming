import tkinter as tk
from tkinter import messagebox
from admin import admin_interface
from user import user_interface
from database import authenticate_user

def login():
    def authenticate():
        username = username_entry.get()
        password = password_entry.get()

        # Check credentials
        role = authenticate_user(username, password)

        if role == "admin":
            admin_interface()
        elif role == "user":
            user_interface()
        else:
            messagebox.showerror("Error", "Invalid username or password")

    login_window = tk.Toplevel()
    login_window.title("Login")

    username_label = tk.Label(login_window, text="Username:")
    username_label.grid(row=0, column=0)
    username_entry = tk.Entry(login_window)
    username_entry.grid(row=0, column=1)

    password_label = tk.Label(login_window, text="Password:")
    password_label.grid(row=1, column=0)
    password_entry = tk.Entry(login_window, show="*")
    password_entry.grid(row=1, column=1)

    login_button = tk.Button(login_window, text="Login", command=authenticate)
    login_button.grid(row=2, columnspan=2)

    login_window.mainloop()
