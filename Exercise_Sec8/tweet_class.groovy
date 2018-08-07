@groovy.transform.Canonical
class Tweet {

    String content
    String username
    Date createdOn

    private List retweets = []
    private List favorites = []
    private List mentions = []
    private List tags = []

    void favorites(String username) {
        favorites << username
    }

    List getFavorites() {
        favorites
    }

    void retweets(String username) {
        retweets << username
    }

    List getRetweets() {
        retweets
    }

    List getMentions() {
        String search = /\B@[a-z0-9_-]+/
        content.findAll(search)
    }

    List getTags() {
        String search = /(?:\s|\A)[##]+([A-Za-z0-9-_]+)/
        content.findAll(search)
    }
}

Tweet tweet = new Tweet(content: "This is my first post #firstpost #groovy @jenkyval rules", username: "@chrisbs", createdOn: new Date() )

println tweet

tweet.favorites("@uncleBob")
tweet.retweets("@shadyBill")

println tweet.getFavorites()
println tweet.getRetweets()

println tweet.getMentions()
println tweet.getTags()