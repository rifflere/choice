# choice
## SDEV 301 Review
I created a short program to review the following concepts in Java:
- **Maps**
- **Compound Data Structures**

I used data on Latin vocabulary frequency from [Dickinson College Commentaties](https://dcc.dickinson.edu/latin-core-list1?field_search_lemma_value=&field_part_of_speech_value=All&field_semantic_group_value=All&order=field_frequency_rank&sort=asc
) to create this program.
### What you see when you run this program
When you run this program, the following prompt prints on the screen:

> Enter a number to view one on the following:   

>1 - high frequency Latin conjunctions  

>2 - high frequency Latin pronouns  

>3 - high frequency Latin prepositions

If you enter, for example, "3", the output is:

>The most common Latin prepositions are:  

>in  

>ad  

>cum

(This is, in fact, an accurate list of the three most common Latin prepositions. Respectively, they mean approximately "in," "to/toward", and "with/when/since/although/nevertheless." Aren't prepositions great!)

### What is happening

This program constructs three **Array Lists** that each contain high frequency Latin vocab, one each for *conjunctions*, *pronouns*, and *prepositions*.

It then constructs a **Hash Map** which has String keys and List<String> values. The keys store the names of the lists, and the lists are stored in the values.
