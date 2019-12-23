package ru.validator.repository.inmemory;

import org.springframework.stereotype.Repository;
import ru.validator.model.Node;
import ru.validator.model.Way;
import ru.validator.repository.WayRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class InMemoryWayRepository implements WayRepository {


    private Double[] latlon = new Double[]{56.2360274, 44.0615783};

    private ArrayList<Way> ways = new ArrayList<>();
    {
        ways.add(new Way(1L, Arrays.asList(
                new Node(1709076197L, 562360274L, 440615783L),
                new Node(1709076205L, 562361235L, 440614220L),
                new Node(1709076211L, 562363082L, 440612143L),
                new Node(1709076373L, 562367601L, 440607237L),
                new Node(1709076614L, 562372615L, 440601697L),
                new Node(1709076665L, 562373934L, 440600119L)
                )));
        ways.add(new Way(2L, Arrays.asList(
                new Node(1709076010L, 562338508L, 440639028L),
                new Node(1709819531L, 562339645L, 440638478L),
                new Node(1709076020L, 562340376L, 440637903L),
                new Node(1709076040L, 562345776L, 440631332L),
                new Node(1709076045L, 562346789L, 440629821L),
                new Node(1709076105L, 562353220L, 440622865L),
                new Node(1709076114L, 562354133L, 440621659L),
                new Node(3576402505L, 562354694L, 440621050L),
                new Node(1709076147L, 562357321L, 440618196L),
                new Node(1709076160L, 562358223L, 440617385L),
                new Node(1709076190L, 562359333L, 440616644L)
        )));
        ways.add(new Way(3L, Arrays.asList(
                new Node(1709076190L, 562359333L, 440616644L),
                new Node(1709076197L, 562360274L, 440615783L)
        )));
    }


    public Double getLat(){return latlon[0];}

    public Double getLon(){return latlon[1];}

    @Override
    public List<Way> getAll() {
        return ways;
    }

    @Override
    public List<Way> getByRegion(int regionId) {
        return null;
    }
}
