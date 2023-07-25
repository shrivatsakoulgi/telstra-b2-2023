 create table toy
     (
     toy_id int primary key,
     toy_name varchar(40),
      price int,
     category varchar(30)
    );
    
    create table customer 
    (
    customer_id int primary key,
    customer_name varchar(40),
    phone bigint,
    email varchar(40),
    location varchar(30)
    );
    
    create table cart
    (
    cart_id int primary key,
    customer_id int,
    toy_id int,
    expiry_date date,
    foreign key (customer_id) references customer(customer_id),
    foreign key (toy_id) references toy(toy_id)
    );
    
    insert into toy values (100234,'Car',2560,'Electronic');
  insert into toy values (100235,'Teddy',560,'Fluffed');  
    insert into toy values (100236,'Legos',1000,'Construction'); 
      insert into toy values (100237,'Building Set',1585,'Construction'); 
        insert into toy values (100238,'Panda',740,'Fluffed'); 
          insert into toy values (100239,'Helicopter',3600,'Electronic'); 
            insert into toy values (100240,'Snake & Ladder',650,'Games'); 
            
            insert into customer values (200163,'Ram',9055578122,'ram@gmail.com','Delhi');
            insert into customer values (200164,'Shyam',9055012122,'shyam@gmail.com','Gurgaon');
            insert into customer values (200165,'Raghav',9133204568,'raghav@gmail.com','Bengaluru');
            insert into customer values (200166,'John',8040506032,'john@gmail.com','Goa');
            insert into customer values (200167,'Adam',7086998822,'adam@gmail.com','Hyderabad');
    
    
			insert into cart values (300879,200163,100234,'2023-08-01');
            insert into cart values (300880,200163,100239,'2023-08-03');
            insert into cart values (300881,200164,100235,'2023-07-31');
            insert into cart values (300882,200164,100238,'2023-08-01');
            insert into cart values (300883,200165,100240,'2023-08-08');
			insert into cart values (300884,200166,100236,'2023-07-30');
            insert into cart values (300885,200166,100237,'2023-07-30');
            insert into cart values (300886,200167,100235,'2023-08-10');
             insert into cart values (300887,200167,100237,'2023-08-10');
              insert into cart values (300888,200167,100239,'2023-08-10');
               insert into cart values (300889,200167,100240,'2023-08-10');
    
    
    #Toys with electronic category    
    select * from toy where category="Electronic";
    
    #Customer whose location is Delhi
    select * from customer where location='Delhi';
    
    # Toy whose price > 1000
    select * from toy where price>1000;
    
    # Name and price of Toys which are 'Fluffed' category
    select toy_name,price,category from toy where category='Fluffed';
    
    #Find minimum price and name of a toy
	select toy_name, price from toy where price= (select min(price) from toy);
    
    #Count of toys put in car by customer 200163
    select count(*) from cart where customer_id=200163;
    
    # Toys based on price
    select * from toy 
    order by toy_name;
    
    ######### Combining Cart and Toy #############
    
    # Toy names of cart of customer 200165
    select c.customer_id, t.toy_id, t.toy_name
    from toy t, cart c
    where c.customer_id=200167 and c.toy_id=t.toy_id;
    
    #sum of prices of all toys in the cart of customer 200167
    #cout of all toys with category="Electronic" put in all carts
    
    
    ######### Combining Cart and Customer #############
    
    #List the customer names who have put toy_id 100239 in their cart
    select cu.customer_name, ca.toy_id
    from customer cu, cart ca
    where ca.toy_id=100239 and 
			ca.customer_id=cu.customer_id;
            
	#List the customer name whose toys expire on or before 2023-08-01
	select cu.customer_name, ca.toy_id, ca.expiry_date
    from customer cu, cart ca
    where ca.expiry_date<='2023-08-01' and ca.customer_id=cu.customer_id;
    
    #List the customer name whose toys expire between 2023-08-01 & 2023-08-10
    #List all the toy_ids in the cart of customer staying in Delhi
    # count the toys in the cart of customer 'Adam'
    
    
      ######### Combining Cart, Toy and Customer #############
      #list the customer names who have put Toy "Helicopter" in their Cart
      
      select cust.customer_name, t.toy_name
      from toy t, customer cust, cart c
      where t.toy_name='Helicopter' and 
			t.toy_id=c.toy_id and
            c.customer_id = cust.customer_id;
    
    #List the names of Toys in the cart of Customer 'Adam'
    # List the toy name, customer name whose expiry on the cart is on or before '2023-08-01'
    #List the Customer names who have toys in the cart whose price is > avg toy price
    # find the total price of cart of 'Raghav'
    #List the toy names and category of 'Shyam' s cart.
    #List all the customer names who have toys in the cart with category 'Fluffed'
    

    
    
    
    
    
    
    
    