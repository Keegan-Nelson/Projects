from website import create_app     # imported from init file

app = create_app()

if __name__ == '__main__':
    app.run(debug=True)

    
