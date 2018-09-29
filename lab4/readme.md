CRC:
1) Class: Customer

Responsibilities: Add personal info: Name, Phone no.;
                  Enter Table Size;
                  Accept/Reject confirmation
                  
Collaborator: Restaurant_System

2) Class: Restaurant_System

Responsibilities: Sends Message notification to customer;
                  Adds customer to waitlist queue;
                  Check for available table and capacity;
                  Updates the waitlist queue;
                  Assigns table to customer

Collaborator: Customer, Table

3) Class: Table

Responsibilities: Table size;
                  Gives Status-Occupied/ Unoccupied

Collaborator: Restaurant_System




Design Patterns:
1)	Objects: Customer and Restaurant_System

Pattern: Observer

Here the pattern is Observer because the Customer subscribes to the Din Tai Fung restaurant reservation system and get updates/notifications for the status of table.

2)	Objects: Table and Restaurant_System

Pattern: State

Here the pattern is State because the state of the table changes from occupied to unoccupied and vice versa which reflects to the Restaurant system.

