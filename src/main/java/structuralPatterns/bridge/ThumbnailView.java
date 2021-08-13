package structuralPatterns.bridge;

public class ThumbnailView extends AbstractView{
    public ThumbnailView(MediaResource resource) {
        super(resource);
    }

    @Override
    public String generateViewInHTML() {
            return "<h1>"+resource.title()+"</h1>\n"+
                    "<img src="+resource.image()+"/>\n";
    }

}
