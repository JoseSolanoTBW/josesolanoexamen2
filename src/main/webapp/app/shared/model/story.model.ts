import { IReview } from 'app/shared/model/review.model';

export interface IStory {
    id?: string;
    code?: string;
    name?: string;
    description?: string;
    status?: string;
    reviews?: IReview[];
}

export class Story implements IStory {
    constructor(
        public id?: string,
        public code?: string,
        public name?: string,
        public description?: string,
        public status?: string,
        public reviews?: IReview[]
    ) {}
}
