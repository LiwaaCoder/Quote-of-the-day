var arrayqoutes=[
{
	"author":"Albert Einstein",
	"quote":"Two things are infinite: the universe and human stupidity; and I'm not sure about the universe."
},
{
	"author":"Oscar Wilde",
	"quote":"Be yourself; everyone else is already taken."
},
{
	"author":"Marilyn Monroe ",
	"quote":"I'm selfish, impatient and a little insecure. I make mistakes, I am out of control and at times hard to handle. But if you can't handle me at my worst, then you sure as hell don't deserve me at my best."
},
{
	"author":"Frank Zappa",
	"quote":"So many books, so little time."
},
{
	"author":"Marcus Tullius Cicero",
	"quote":"A room without books is like a body without a soul."
},
{
	"author":"Bernard M. Baruch",
	"quote":"Be who you are and say what you feel, because those who mind don't matter, and those who matter don't mind."
}
]
function random(arrayLength){
	return Math.floor(Math.random() * arrayLength);
}
function generateQuote(){
	var randomNum = random(arrayqoutes.length);
	document.getElementById("quoteOutput").innerHTML= '"' + arrayqoutes[randomNum].quote + '"';

	document.getElementById("authorOutput").innerHTML= "- " + arrayqoutes[randomNum].author;
}