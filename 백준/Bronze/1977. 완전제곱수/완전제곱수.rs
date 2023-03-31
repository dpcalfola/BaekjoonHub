use std::io;

fn main() {
    // Get min num
    let mut input_line = String::new();
    io::stdin().read_line(&mut input_line).unwrap();
    let min_num = input_line.trim().parse::<u32>().unwrap();

    // Get max num
    input_line.clear();
    io::stdin().read_line(&mut input_line).unwrap();
    let max_num = input_line.trim().parse::<u32>().unwrap();

    // Make square numbers vector
    let square_nums_vec = get_square_nums_vec(max_num);
    // Retain method
    let result = remove_elements_less_than_min_num(min_num, max_num, square_nums_vec);

    // Print answer
    if result.1 == false {
        println!("{}", -1);
    } else {
        let answer_vec: Vec<u32> = result.0;
        let sum_of_answer_vec: u32 = answer_vec.iter().sum();
        let min_square_num = answer_vec[0];

        println!("{}", sum_of_answer_vec);
        println!("{}", min_square_num);
    }
}


fn remove_elements_less_than_min_num(min_num: u32, max_num: u32, mut vec: Vec<u32>) -> (Vec<u32>, bool) {
    // start from min_num
    let mut current = min_num;

    loop {
        // Find the minimum square number
        if vec.contains(&current) {
            vec.retain(|x| *x >= current);
            return (vec, true);
        } else {
            current += 1
        }

        // Does not have square number in the range
        if current > max_num {
            return (vec, false);
        }
    }
}

fn get_square_nums_vec(max_num: u32) -> Vec<u32> {
// Get square numbers which less than n
    let mut square_nums: Vec<u32> = vec![];
    let mut cnt: u32 = 1;
    loop {
        let current = cnt.pow(2);
        if current <= max_num {
            square_nums.push(current);
            cnt += 1
        } else {
            break;
        }
    }
    return square_nums;
}

