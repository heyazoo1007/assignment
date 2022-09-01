package likelion.assignment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public void save(String title, String author) {
        Board board = new Board(title, author, LocalDate.now());
        boardRepository.save(board);
    }

    public List<Board> findAll() {
        return boardRepository.findALl();
    }
}