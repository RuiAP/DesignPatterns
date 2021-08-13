package structuralPatterns.bridge;

public class FullPageView  extends AbstractView{


    public FullPageView(MediaResource resource) {
        super(resource);
    }

    @Override
    public String generateViewInHTML() {
        return "<h1>"+resource.title()+"</h1>\n"+
                "<img src="+resource.image()+"/>\n"+
                "<p>"+resource.textContent()+"</p>\n"+
                "<p>by "+resource.author()+"</>\n";
    }
}
