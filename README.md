Driver = κλάση που πραγματοποιεί την σύνδεση της MySQL database μέσω Java. Η σύνδεση λειτουργεί αποκλειστικά για ένα υπολογιστή (είναι δηλαδή μια local σύνδεση)

findLevenshteinDistance = μέθοδος που επιστρέφει την απόσταση 2 λέξεων, χρησιμοποιωντας τον αλγόριθμο του Levenshtein και εναν δυσδιαστατο 
πίνακα.

findSuggestions() = μέθοδος που επιλέγει απο την βαση λεξεις που εχουν κοντινο μεγεθος με την λεξη που συγκρινουμε, και καθε φορα που επιλεγει μια λεξη απο την βαση, χρησιμοποιει την findLevenshteinDistance() για να παρει την διαφορα τους. Αν η διαφορα τους ειναι μεσα στο ορια που της θετουμε, τοτε αποθηκευει την λεξη σε μια λιστα. Στο τελος επιστρεφει την λιστα με τις αποθηκευμενες λεξεις.
