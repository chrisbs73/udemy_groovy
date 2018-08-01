@groovy.transform.ToString()
class Tweet {

    String username
    String content
    Integer retweets
    Integer favorites
    Date createdOn    

    public Tweet(String user, String tweet) {
        username = user
        content = tweet
        createdOn = new Date()
        retweets = 0
        favorites = 0
    }
    
    void AddToRetweets() {
        retweets += 1
    }
    
    void AddToFavorites() {
        favorites += 1
    }

}