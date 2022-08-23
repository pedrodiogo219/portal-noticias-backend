package com.example.portal;

import org.springframework.boot.CommandLineRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyCommandLineRunner implements CommandLineRunner{
    private static final Logger log = LoggerFactory.getLogger(JornalistaLoadDatabase.class);
    private JornalistaRepository jornalistaRepository;

    private NoticiaRepository noticiaRepository;
    
    MyCommandLineRunner(JornalistaRepository jornalistaRepository, NoticiaRepository noticiaRepository){
        this.jornalistaRepository = jornalistaRepository;
        this.noticiaRepository = noticiaRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Jornalista j1 = new Jornalista("William Boner", "12345678901", "(34)993079307");
        Jornalista j2 = new Jornalista("Fatima Bernardes", "98765432101", "(34)915581558");
        log.info("Preloading " + this.jornalistaRepository.save(j1));
        log.info("Preloading " + this.jornalistaRepository.save(j2));


        Noticia n1 = new Noticia(
            "Twitter stock plunges on prospect of legal battle with Elon Musk",
            "After billionaire Elon Musk said that he was abandoning his $44 billion buyout, Twitter vowed to pursue him in court.",
            """
                Shares of Twitter plummeted on Monday afternoon on the prospect of a prolonged legal fight between the social media company and billionaire Elon Musk, who says he's pulling out of a buyout deal, leaving Twitter's future in doubt.
                In announcing he was dropping the deal on Friday, Musk claimed that Twitter refused to provide enough information about the number of fake accounts it has and that Musk's advisors determined the true incidence of bots on the platform is \"wildly higher\" than Twitter claims. The social media platform then vowed to challenge Musk in court to uphold the agreement, and has hired powerhouse law firm Wachtell, Lipton, Rosen & Katz in preparation for filing a lawsuit this week in Delaware Court of Chancery, according to Bloomberg. 
                Generally, acquisition agreements are exceeedingly difficult to get out of.  \"Once you're into the world where you already have the agreement, it's rare for people to try to pull out,\" said Mathieu Shapiro, managing partner at Obermayer, who specializes in business litigation. \"As a basic premise, the Delaware court will want to enforce that merger agreement, and that will be their starting place.
            """,
            "https://www.cnnbrasil.com.br/wp-content/uploads/sites/12/2021/06/29316_D916368809E6CAD8-1.jpg?w=876&h=484&crop=1",
            Long.valueOf(1)
        );

        Noticia n2 = new Noticia(
            "Yelp to close 3 U.S. offices, saying the \"future of work\" is remote",
            "Employees at the online review company used less than 2% of its office space in Chicago, New York and Washington, D.C.",
            """
                Yelp is closing three of its U.S. offices after finding most of its employees prefer to work remotely.
                In a blog post Thursday, Yelp Cofounder and CEO Jeremy Stoppelman said the company will close its offices in Chicago, New York and Washington, D.C., on July 29. The online review and reservation company also plans to downsize its office in Phoenix.
                \"Combined, the three offices we're closing saw a weekly average utilization of less than 2% of the available workspaces,\" Stoppelman wrote.
                Job postings for remote work rise, as many say they like it
                Elon Musk says remote work is \"no longer acceptable\"
                Airbnb allows employees to live and work from anywhere
                San Francisco-based Yelp announced a remote-first work model in February 2021. Stoppelman said Yelp has proven it can be successful with a remote workforce, noting that the company achieved record revenue of just over $1 billion in 2021.
            """,
            "https://geekblog.com.br/wp-content/uploads/2015/03/yelp_estimate_tool.jpg",
            Long.valueOf(2)
        );

        log.info("Preloading " + this.noticiaRepository.save(n1));
        log.info("Preloading " + this.noticiaRepository.save(n2));
    }
    
}
