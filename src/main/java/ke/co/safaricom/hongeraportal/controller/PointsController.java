package ke.co.safaricom.hongeraportal.controller;

import ke.co.safaricom.hongeraportal.service.PointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/points")
public class PointsController {

    private final PointsService pointsService;

    @Autowired
    public PointsController(PointsService pointsService) {
        this.pointsService = pointsService;
    }

    @PostMapping("/allocate/{points}")
    public void allocatePointsToAllUsers(@PathVariable int points) {
        pointsService.allocatePointsToAllUsers(points);
    }

    @PostMapping("/transfer/{giverUserId}/{receiverUserId}/{points}")
    public void transferPoints(
            @PathVariable Long giverUserId,
            @PathVariable Long receiverUserId,
            @PathVariable int points
    ) {
        pointsService.transferPoints(giverUserId, receiverUserId, points);
    }

    @GetMapping("/current/{userId}")
    public int getCurrentPoints(@PathVariable Long userId) {
        return pointsService.getCurrentPoints(userId);
    }

    @PostMapping("/award/{userId}/{points}")
    public void awardPoints(
            @PathVariable Long userId,
            @PathVariable int points
    ) {
        pointsService.awardPoints(userId, points);
    }

    @PostMapping("/deduct/{userId}/{points}")
    public void deductPoints(
            @PathVariable Long userId,
            @PathVariable int points
    ) {
        pointsService.deductPoints(userId, points);
    }
    @GetMapping("/{giverUserId}/{receiverUserId}")
    public ResponseEntity<String> awardPoints(
            @PathVariable Long giverUserId,
            @PathVariable Long receiverUserId) {

        // Use giverUserId in your logic
        System.out.println("Giver User ID: " + giverUserId);

        // Your logic here, calling pointsService.awardPoints or similar
        // ...

        return ResponseEntity.ok("Points awarded successfully");
    }
    @GetMapping("/{receiverUserId}")
    public ResponseEntity<String> awardPoints(
            @PathVariable Long receiverUserId) {

        // Your logic here, calling pointsService.awardPoints or similar
        // ...

        return ResponseEntity.ok("Points awarded successfully");
    }

}

