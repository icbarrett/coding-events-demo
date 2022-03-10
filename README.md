# coding-events-demo

Person Class:
	Fields:
		name String	
		email String
		password String
		interested events List<eventType> many to many
		events attended List<event> many to many
		favorite category LIST<eventCategory> many to one

Methods:
	getters & setters
	get favorite category
	add events attended
